import { Component, OnInit, Input } from '@angular/core';
import { Comment } from 'src/models/comment';
import { PageOfItems } from 'src/models/page-of-item';
import { Post } from 'src/models/post';
import { PostServiceService } from 'src/services/post-service/post-service.service';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {

  comment!: PageOfItems<Comment>;
  post!: Post;
  constructor(private postService: PostServiceService) { }
  ngOnInit(): void {
    // this.postService.getComments().subscribe((data: PageOfItems<Comment>) => {
    //   this.comment! = data
    // })
  }
}
