import {Component} from '@angular/core';

/**
 * @title Paginator
 */
@Component({
  selector: 'listar_agendamentoteste',
  templateUrl: 'listar_agendamentoteste.jsp',
  styleUrls: ['paginator-overview-example.css'],
})
export class PaginatorOverviewExample {
currentItemsToShow= [];
items = [
  {name: 'name1', id: 1},{name: 'name2', id: 1},{name: 'name3', id: 1},
  {name: 'name4', id: 1},{name: 'name5', id: 1},{name: 'name6', id: 1},{name: 'name7', id: 1},{name: 'name8', id: 1},{name: 'name9', id: 1},
  {name: 'name10', id: 1},{name: 'name11', id: 1},{name: 'name12', id: 1},{name: 'name13', id: 1},{name: 'name14', id: 1},{name: 'name15', id: 1},{name: 'name16', id: 1},{name: 'name17', id: 1},{name: 'name18', id: 1},{name: 'name19', id: 1},{name: 'name20', id: 1},{name: 'name21', id: 1},{name: 'name22', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},{name: 'name1', id: 1},
];

ngOnInit() {
  this.currentItemsToShow = this.items;
}
  onPageChange($event) {
    this.currentItemsToShow =  this.items.slice($event.pageIndex*$event.pageSize, $event.pageIndex*$event.pageSize + $event.pageSize);
  }
}


/**  Copyright 2019 Google Inc. All Rights Reserved.
    Use of this source code is governed by an MIT-style license that
    can be found in the LICENSE file at http://angular.io/license *//* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


