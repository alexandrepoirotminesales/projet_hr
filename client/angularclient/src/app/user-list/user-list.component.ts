import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserServiceService} from '../user-service.service';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[];

  constructor(private userService: UserServiceService) {
  }

  ngOnInit() {
    this.userService.findAll().subscribe((data: User[]) => {
      this.users = data;
    });
  }
}