let boxes =document.querySelectorAll('.contenedor div');

boxes.forEach(box => {
        box.addEventListener('click', Magia)
              })


function Magia() {
  this.style.opacity = 0;
}
