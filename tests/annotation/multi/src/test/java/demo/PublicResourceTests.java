/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import sparklr.common.AbstractIntegrationTests;

/**
 * @author José Filipe Neis
 *
 */
public class PublicResourceTests extends AbstractIntegrationTests {

	@Test
	public void testPublicEndpoint1IsAccessible() throws Exception {
		ResponseEntity<String> response = http.getForString("/public1");
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	public void testPublicEndpoint2IsAccessible() throws Exception {
		ResponseEntity<String> response = http.getForString("/public2");
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
