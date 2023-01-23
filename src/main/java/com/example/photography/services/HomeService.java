package com.example.photography.services;

import com.example.photography.model.PhotoGrapher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class HomeService {
    List<PhotoGrapher> photographers = new ArrayList<>();
    HashSet<PhotoGrapher> unique = new HashSet<>(photographers);

    public HashSet<PhotoGrapher> getPhotographers() {
        PhotoGrapher p1 = new PhotoGrapher("test1@gmail.com","123","https://cdn.dribbble.com/users/5534/screenshots/14230133/media/e2f853f8232acad78bf143c32f2f3a04.jpg?compress=1&resize=400x300");
        PhotoGrapher p2 = new PhotoGrapher("test2@gmail.com","321","https://media.istockphoto.com/id/1309328823/photo/headshot-portrait-of-smiling-male-employee-in-office.jpg?b=1&s=170667a&w=0&k=20&c=MRMqc79PuLmQfxJ99fTfGqHL07EDHqHLWg0Tb4rPXQc=");
        unique.add(p1);
        unique.add(p2);
        return unique;
    }

    public HashSet<PhotoGrapher> savePhotographer(PhotoGrapher photoGrapher){
       unique.add(photoGrapher);
       return unique;
    }

}
