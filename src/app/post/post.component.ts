import { ThisReceiver } from '@angular/compiler';
import { Component, Input, OnInit } from '@angular/core';
import { PageOfItems } from 'src/models/page-of-item';
import { PostUI } from 'src/models/PostUI';
import { User } from 'src/models/user';
import { PostServiceService } from 'src/services/post-service/post-service.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  User = new User();
  @Input()
  postData: PostUI = new PostUI();

  constructor(private postServiceService: PostServiceService) { 
<<<<<<< HEAD
  }
  
  User = new User();
  Post = new Post();
  // getListOfPost(pageNumber: number, pageSize: number){
  //   this.postServiceService.fetchListOfPosts(pageNumber, pageSize).subscribe()
  // }
=======
  
  }
    pageNumber: number = 0;
    pageSize: number = 5;
>>>>>>> develop
  
  ngOnInit(): void {
   
  }
}
