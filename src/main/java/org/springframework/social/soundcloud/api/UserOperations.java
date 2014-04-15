/*
 * Copyright 2011 the original author or authors.
 *
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
 */
package org.springframework.social.soundcloud.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* Defines operations for interacting with a SoundCloud User
* @author Michael Lavelle
*/
public interface UserOperations {

	public SoundCloudProfile getUserProfile();
	
	public Page<Track> getFavorites();
	public Page<Track> getFavorites(Pageable pageable);
	
	public Page<SoundCloudProfile> getFollowing();
	public Page<SoundCloudProfile> getFollowing(Pageable pageable);


	public Page<Track> getTracks(Pageable pageable);
	public Page<Track> getTracks();
	
	public Page<Playlist> getPlaylists(Pageable pageable);
	public Page<Playlist> getPlaylists();

	public void favoriteTrack(long trackId);
	
	public void followUser(long userId);

    public Page<SoundCloudProfile> getFollowers();
    public Page<SoundCloudProfile> getFollowers(Pageable pageable);


}
