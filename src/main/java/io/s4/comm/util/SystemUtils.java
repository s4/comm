/*
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 	        http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License. See accompanying LICENSE file. 
 */
package io.s4.comm.util;

public class SystemUtils {

    private SystemUtils() {
    }

    public static long getPID() {
        String processName = java.lang.management.ManagementFactory.getRuntimeMXBean()
                                                                   .getName();
        return Long.parseLong(processName.split("@")[0]);
    }

    public static void main(String[] args) {
        String msg = "My PID is " + SystemUtils.getPID();

        javax.swing.JOptionPane.showConfirmDialog((java.awt.Component) null,
                                                  msg,
                                                  "SystemUtils",
                                                  javax.swing.JOptionPane.DEFAULT_OPTION);

    }

}
