import { Component, OnInit, Input } from '@angular/core';
import { Comment } from 'src/models/comment';
import { PageOfItems } from 'src/models/page-of-item';
import { Post } from 'src/models/post';
import { PostUI } from 'src/models/PostUI';
import { PostServiceService } from 'src/services/post-service/post-service.service';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {

  
  post: PostUI = new PostUI();
  comments: PageOfItems<Comment> = {
    items: [],
    hasNext: false,
    totalElements: 0
  };
  pageNumber: number = 0;
  pageSize: number = 5;
  constructor(private postService: PostServiceService) { }
  ngOnInit(): void {
    this.postService.getComments(this.post, this.pageNumber, this.pageSize).subscribe((data: PageOfItems<Comment>) => {
      this.comments! = data;
    })
  }
}
