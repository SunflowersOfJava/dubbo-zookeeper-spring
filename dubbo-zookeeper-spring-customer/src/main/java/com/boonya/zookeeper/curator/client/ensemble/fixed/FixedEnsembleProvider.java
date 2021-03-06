/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.boonya.zookeeper.curator.client.ensemble.fixed;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import org.apache.curator.ensemble.EnsembleProvider;

import java.io.IOException;

/**
 * Standard ensemble provider that wraps a fixed connection string
 */
public class FixedEnsembleProvider implements EnsembleProvider
{
    private final String connectionString;

    /**
     * The connection string to use
     *
     * @param connectionString connection string
     */
    public FixedEnsembleProvider(String connectionString)
    {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(connectionString),
            "connectionString cannot be null or empty");
        this.connectionString = connectionString;
    }

    @Override
    public void start() throws Exception
    {
        // NOP
    }

    @Override
    public void close() throws IOException
    {
        // NOP
    }

    @Override
    public String getConnectionString()
    {
        return connectionString;
    }

	@Override
	public void setConnectionString(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateServerListEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
