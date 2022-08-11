/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.example.core.jdbc;

import org.apache.shardingsphere.infra.config.mode.ModeConfiguration;
import org.apache.shardingsphere.mode.repository.standalone.StandalonePersistRepositoryConfiguration;
import java.util.Properties;

public final class StandaloneModeConfigurationUtil {

    public static ModeConfiguration getJdbcConfiguration(final boolean overwrite) {
        Properties properties = new Properties();
        properties.setProperty("provider", "H2");
        properties.setProperty("jdbc_url", "jdbc:mysql://localhost:3306/demo_ds_0?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8");
        properties.setProperty("username", "root");
        properties.setProperty("password", "");
        StandalonePersistRepositoryConfiguration standaloneRepositoryConfig = new StandalonePersistRepositoryConfiguration("JDBC", properties);
        return new ModeConfiguration("Standalone", standaloneRepositoryConfig, overwrite);
    }
}
