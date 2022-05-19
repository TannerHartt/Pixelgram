import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { PageOfItems } from 'src/models/page-of-item';
import { Post } from 'src/models/post';
import { User } from 'src/models/user';
import { PostServiceService } from 'src/services/post-service/post-service.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  User = new User();
  Post = new Post();

  posts!: Post[];

  constructor(private postServiceService: PostServiceService) { 
    this.postServiceService = postServiceService;
  }
   postService!: PostServiceService

   
  

    user1: User = {
      id: 0,
      username: " ",
      profileImg: " ",
    } 

    commentPage: PageOfItems<Comment> = {
      items: [],
      hasNext: false,
      totalElements: 0
    }

    post: Post = {
      id: 0,
      user: this.user1,
      img: " ",
      description: " ",
      createdOn: new Date(),
      comments: []
    }
    pageNumber!: number;
    pageSize!: number;

    

  
  ngOnInit(): void {
    this.fetchPagedPosts();
  }


  this.postService.fetchPagedPosts()
  

}
