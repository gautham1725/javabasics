import { Component , OnInit , OnChanges , OnDestroy  } from '@angular/core';
import { IMovies } from './../interface/interface.movie'
@Component({
  selector: 'mov-app',
  templateUrl : './movie.component.html',
})

export class MovieComponent implements OnInit , OnChanges , OnDestroy  {
 

  constructor(){
    this.title = '2.0';
    console.log("In constructor "+ this.title );
  }

  ngOnInit(): void {
    this.title = 'baahubali';
    console.log("At init phase "+this.title);
  }

  ngOnChanges(): void {
    console.log("At change detection phase "+this.title);
  }

  ngOnDestroy(): void {
    console.log("Destroying the component "+this.title);
  }
  
  

  title:string = 'Avenger';
  imgWidth:number=100;
  imgHeight:number=50;
  url:string='./../assets/Movie-Images/avenger.jpg';
  

  showMovie():void{

    this.title="Avengers EndGame";
    this.imgHeight=400;
    this.imgWidth=800;    
    
  }

  movies:IMovies[] = [

    { mid :1 , movieName : "avenger" , actor : "captain" , release:"May" , price:200 , rating:"4/5" , imageUrl : './../assets/Movie-Images/avenger.jpg' },
    { mid :2 , movieName : "KGF" , actor : "Yash" , release:"June" , price:300 , rating:"3/5" , imageUrl : "" },
    { mid :3 , movieName : "Bahubali" , actor : "Prabhas" , release:"May" , price:200 , rating:"4/5" , imageUrl : "" },
    { mid :4 , movieName : "2.0" , actor : "Rajinikanth" , release:"Feb" , price:400 , rating:"3.5/5" , imageUrl : "" },
    { mid :5 , movieName : "FF7" , actor : "Vin diesel" , release:"August" , price:200 , rating:"4/5" , imageUrl : './../assets/Movie-Images/ff7.jpg' },
    { mid :6 , movieName : "Ironman" , actor : "robert" , release:"March" , price:500 , rating:"5/5" , imageUrl : "" },

  ]
  
}
