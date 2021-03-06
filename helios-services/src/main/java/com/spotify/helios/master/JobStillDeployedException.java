/*-
 * -\-\-
 * Helios Services
 * --
 * Copyright (C) 2016 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.helios.master;

import com.spotify.helios.common.HeliosException;
import com.spotify.helios.common.descriptors.JobId;
import java.util.List;

public class JobStillDeployedException extends HeliosException {

  private final JobId id;
  private final List<String> hosts;

  public JobStillDeployedException(JobId id, List<String> hosts) {
    super(String.format("job %s still deployed on hosts %s", id, hosts));
    this.id = id;
    this.hosts = hosts;
  }

  public JobId getId() {
    return id;
  }

  public List<String> getHosts() {
    return hosts;
  }
}
