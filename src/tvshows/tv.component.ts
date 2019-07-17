import { Component } from '@angular/core';

@Component({
    selector : 'tv-show',
    templateUrl : './tv.component.html',
   // styleUrls : ['./tv.component.css']

})

export class TVComponent{

    showName : string='GoT';
    broadcaster : string ='Netflix';
    ratings:number=5;
    
}