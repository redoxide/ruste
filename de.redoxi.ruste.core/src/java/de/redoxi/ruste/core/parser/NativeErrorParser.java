/*
 * Copyright 2013-2014 Hayden Smith
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under 
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package de.redoxi.ruste.core.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parses the given source input stream for errors and warnings
 * 
 * @author Hayden Smith
 * @since 1.0.0
 */
public class NativeErrorParser {

    /*
     * Group 1: File name 
     * Group 2: Start line 
     * Group 3: Start offset 
     * Group 4: End line 
     * Group 5: End offset 
     * Group 6: Message type 
     * Group 7: Message
     */
    private final static Pattern ERROR_LINE_PATTERN = Pattern
	    .compile("(.*):(\\d+):(\\d+):\\s(?:(\\d+):(\\d+)\\s)?(\\w+):\\s(.*)");

    private InputStream inputStream;

    /**
     * Instantiate parser using given input stream as the source
     * 
     * @param project
     * @param file
     * @param inputStream
     */
    public NativeErrorParser(final InputStream inputStream) {
	this.inputStream = inputStream;
    }

    /**
     * Parses the output of the rustc compiler and adds markers to the
     * applicable document in the given project.
     * 
     * Note: this method does not close the input stream
     * 
     * @param project
     *            The project containing the file that the output was generated
     *            from
     * @param errorStream
     *            The output from the compiler
     * @throws IOException
     *             Re-throw an I/O exception encountered while reading the
     *             output of the compiler
     */
    public void parse() throws IOException {
	BufferedReader errorReader = new BufferedReader(new InputStreamReader(
		inputStream));

	String line = null;

	while ((line = errorReader.readLine()) != null) {
	    Matcher matcher = ERROR_LINE_PATTERN.matcher(line);
	    if (matcher.matches()) {
		final String fileName = matcher.group(1);
		final Integer startLine = new Integer(matcher.group(2));
		final Integer startPos = new Integer(matcher.group(3));
		final Integer endLine = new Integer(matcher.group(4));
		final Integer endPos = new Integer(matcher.group(5));
		final String type = matcher.group(6);
		final String message = matcher.group(7);

		if ("error".equalsIgnoreCase(type)) {
		    onError(fileName, startLine, startPos, endLine, endPos,
			    message);
		} else if ("warning".equalsIgnoreCase(type)) {
		    onWarning(fileName, startLine, startPos, endLine, endPos,
			    message);
		}
	    }
	}
    }

    protected void onError(String fileName, int startLine, int startPos,
	    int endLine, int endPos, String message) {

    }

    protected void onWarning(String fileName, int startLine, int startPos,
	    int endLine, int endPos, String message) {

    }

}
