const loader = document.querySelector('.loader');
const submitBtn = document.querySelector('.submit-btn');
const name = document.querySelector('.name');
const email = document.querySelector('.email');
const password = document.querySelector('.password');

submitBtn.addEventListener('click', () => {
    if(!name.value.length){
        alert('Enter your name');
    }else if(email.value.length){
        alert('Enter your email address');
    }else if(password.value.length <8){
        alert('Your password must more than 8 characters');
    }else{
        loader.style.display = 'block';
        sendData('/signup',{
            name:name.value,
            email:email.value,
            password:password.value,

        })
    }
})


const sendData = (path,data) =>{
    fetch(path,{
        method: 'post',
        headers: new Headers({'Content-Type': 'application/json'}),
        body: JSON.stringify(data)
    }).then((res) => res.json())
    .then(response => {
        procesData(response);
        console.log(response);
    })
}

const procesData = (data) =>{
    loader.style.display = null;
    if(data.alert){
        
    }
}