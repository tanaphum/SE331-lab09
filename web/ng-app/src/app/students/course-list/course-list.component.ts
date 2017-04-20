import {Component, Input} from "@angular/core";
import {Course} from "../course";

/**
 * Created by Powernet&com on 4/18/2017.
 */
@Component({
  selector: 'course-list',
  templateUrl: './course-list.component.html',
  styleUrls:['./course-list.component.css']
})
export class  CourseListComponent{
  constructor(){

  }
  @Input() count:number;
  @Input('enrolledCourse') courses:Course;
  ngOnInit(){

  }
}
