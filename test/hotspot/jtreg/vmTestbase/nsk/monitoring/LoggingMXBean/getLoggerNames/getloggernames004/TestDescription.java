/*
 * Copyright (c) 2017, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/monitoring/LoggingMXBean/getLoggerNames/getloggernames004.
 * VM Testbase keywords: [quick, monitoring]
 * VM Testbase readme:
 * DESCRIPTION
 *         Interface: java.util.logging.LoggingMXBean
 *         Method: getLoggerNames()
 *         Returns the list of currently registered loggers
 *         Access to metrics is provided in following way: default MBeanServer
 *             through proxy.
 *     The test checks that
 *         1. This method calls LogManager.getLoggerNames() and returns a
 *             list of the logger names.
 * COMMENT
 *
 * @library /vmTestbase
 *          /test/lib
 * @run main/othervm
 *      nsk.monitoring.LoggingMXBean.getLoggerNames.getloggernames001
 *      -testMode=proxy
 *      -MBeanServer=default
 */

