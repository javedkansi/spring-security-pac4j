/*
  Copyright 2012 - 2015 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.springframework.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Exception used to wrap pac4j's exceptions into spring-security's exceptions
 *
 * @author Victor Leroy
 * @since 1.4.0
 */
public class AuthenticationCredentialsException extends AuthenticationException {

    public AuthenticationCredentialsException(String msg, Throwable t) {
        super(msg, t);
    }

    public AuthenticationCredentialsException(String msg) {
        super(msg);
    }
}
