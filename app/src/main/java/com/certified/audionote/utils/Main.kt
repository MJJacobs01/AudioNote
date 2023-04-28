/*
 * Copyright (c) 2023 Samson Achiaga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.certified.audionote.utils

fun main() {
    val i = "00:08:18"
    val time = i.filter { it.isDigit() }.toLong()
    val sec = time % 60
    val minute = (time % 3600) / 60
    println("Time: $time, Minute: $minute, Second: $sec")
//    print(isEven(201))
}

fun isEven(number: Int): String {
    return when (number % 2) {
        0 -> "true"
        else -> "false"
    }
}