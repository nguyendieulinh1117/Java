let images = [];

for(var i = 0; i < 6; i++){
    images[i] = new Image();

    images[i].src = './Anh/anh' + i + '.jpg'; 
}

let index = 0;

function first(){
    index = 0;
    document.getElementById('picture').src = images[index].src;
}

function last(){
    index = images.length - 1;
    document.getElementById('picture').src = images[index].src;
}
function next(){
    index ++;
    if(index >= images.length){
        index = 0;
    }

    document.getElementById('picture').src = images[index].src;
}

function prev(){
    index--;
    if(index < 0){
        index = images.length - 1;
    }

    document.getElementById('picture').src = images[index].src;
}

document.querySelector('#prev').addEventListener('click', ()=>{
    prev();
});
document.querySelector('#next').addEventListener('click', ()=>{
    next();
});
document.querySelector('#first').addEventListener('click', ()=>{
    first();
});
document.querySelector('#last').addEventListener('click', ()=>{
    last();
});