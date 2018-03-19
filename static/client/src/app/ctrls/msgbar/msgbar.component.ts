import { Component, OnInit, Input } from '@angular/core';

import { Notification } from './../../models/notification';

import { BindService } from './../../services/bind.service';

@Component({
  selector: 'app-msgbar',
  templateUrl: './msgbar.component.html',
  styleUrls: ['./msgbar.component.css']
})
export class MsgbarComponent implements OnInit {

  notification: Notification = new Notification();
  show: boolean = true;

  constructor(private bindService: BindService) {
    console.log('msgbar-component:create');
    this.bindService.change.subscribe(notification => {
    console.log('msgbar-component:recv');
      this.notification = notification;
      this.show = true;
      console.log(this.notification);
    });
  }

  ngOnInit() {
    console.log('msgbar-component:init');
  }


}
