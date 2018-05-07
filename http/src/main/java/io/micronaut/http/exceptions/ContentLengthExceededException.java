/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.http.exceptions;

/**
 * Exception thrown when the content length exceeds the allowed amount
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class ContentLengthExceededException extends HttpException {
    public ContentLengthExceededException(String message) {
        super(message);
    }

    public ContentLengthExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContentLengthExceededException(long advertisedLength, long receivedLength) {
        this("The received length [" + receivedLength + "] exceeds the maximum content length [" + advertisedLength + "]");
    }
}
