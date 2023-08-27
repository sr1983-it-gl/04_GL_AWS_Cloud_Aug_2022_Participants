
import {areaOfCircle, areaOfRectangle} from "./math-lib.js";

let radius = 10;
let result = areaOfCircle(radius);

console.log(`Area of circle with radius ${radius} is ${result}`);

let length = 10;
let breadth = 20;

result = areaOfRectangle(length, breadth);

console.log(`Area of rectangle with length ${length} and ${breadth} is ${result}`);

