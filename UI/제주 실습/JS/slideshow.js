
var slides = dicument.querySelectorAll("#slides > img");
var prev = document.getElementById("prev");
var next = dicument.getElemenById("next");

var current = 0;

showSlides(current);
prev.onclick = prevSlide;
next.onclick = nextSlide;

function showSlides(n) {
    for(var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slides[n].style.display = "block";
}

function prevSlide() {
    if(current > 0 ) surrent -= 1;
    else current = slides.length - 1;
    showSlides(current);
}


function nextSlide() {
    if(current < slides.legth - 1) current += 1;
    else current = 0;
    showSlides(current);
}