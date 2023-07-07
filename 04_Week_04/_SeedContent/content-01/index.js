const backgroundImages = new Array();

backgroundImages[0] = "images/car-01.png";
backgroundImages[1] = "images/car-02.png";
backgroundImages[2] = "images/car-03.png";
backgroundImages[3] = "images/car-04.png";

function displayAllImages() {

    for (i = 0; i < backgroundImages.length; i++) {
        document.write("<li><img src='" + backgroundImages[i] + "' width='160' height='120'/><span></span></li>");
    }
}