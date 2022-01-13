package com.apirest.webfluxapi;

import java.util.UUID;

import com.apirest.webfluxapi.document.Playlist;
import com.apirest.webfluxapi.repository.PlaylistRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

// @Component
// public class DummyData implements CommandLineRunner{
    
//     private final PlaylistRepository playlistRepository;

//     DummyData(PlaylistRepository playlistRepository){
//         this.playlistRepository = playlistRepository;
//     }

//     @Override
//     public void run(String... args) throws Exception {

//         playlistRepository.deleteAll()
//             .thenMany(
//                 Flux.just("this is marina sena","this is jean tassy","this is tame impala","this is flora matos","this is djonga")
//             .map(name -> new Playlist(UUID.randomUUID().toString(), name))
//             .flatMap(playlistRepository::save))
//             .subscribe(System.out::println);
//     }
    
// }
