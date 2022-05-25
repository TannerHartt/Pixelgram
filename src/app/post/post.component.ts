import { Component, OnInit } from '@angular/core';
import { Post } from 'src/models/post';
import { User } from 'src/models/user';
import { PostServiceService } from 'src/services/post-service/post-service.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  constructor(private postServiceService: PostServiceService) { 
  }
  
  User = new User();
  Post = new Post();
  // getListOfPost(pageNumber: number, pageSize: number){
  //   this.postServiceService.fetchListOfPosts(pageNumber, pageSize).subscribe()
  // }
  
  ngOnInit(): void {
  }

}
