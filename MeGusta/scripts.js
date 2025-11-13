

function likes(elemento){
    let num_likes = parseInt(elemento.closest(".likes-count").querySelector(".like").innerHTML);
    num_likes++;
    elemento.closest(".likes-count").querySelector(".like").innerHTML = num_likes;
}