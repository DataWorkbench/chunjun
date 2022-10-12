/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.chunjun.connector.kingbase.source;

import com.dtstack.chunjun.connector.jdbc.source.JdbcInputFormat;
import com.dtstack.chunjun.connector.jdbc.util.JdbcUtil;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * @description:
 * @program chunjun
 * @author: lany
 * @create: 2021/05/13 20:10
 */
public class KingbaseInputFormat extends JdbcInputFormat {

    @Override
    protected Pair<List<String>, List<String>> getTableMetaData() {
        return JdbcUtil.getTableMetaData(
                null,
                StringUtils.upperCase(jdbcConf.getSchema()),
                StringUtils.upperCase(jdbcConf.getTable()),
                dbConn);
    }
}
