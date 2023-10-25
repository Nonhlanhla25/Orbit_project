const express = require('express');
const admin = require('firebase-admin');
const bycrpt = require('bcrypt');
const path = require('path');

let staticPath = path.join(__dirname,"products");
const app = express('path');

app.use(express.static(staticPath));
app.use(express.json());

app.get("/", (req, res) => {
    res.sendFile(path.join(staticPath, "index.html"));
})

app.get('/signup' , (req, res) => {
    res.sendFile(path.join(staticPath, "/login/signup.html"));

})

app.post('/signup' , (req, res) => {
    console.log(req.body);
    let {name,email,password} = req.body;
    if(!name.length){
        return res.json({'alert':'Enter your name'});
    }else if(!email.length){
        return res.json({'alert':'Enter your email address'});
    }else if(password.length <8){
        return res.json({'alert':'Your password must more than 8 characters'});
    }

    // store the user data
    db.collection('user').doc(email).get()
    .then(user =>{
        if(user.exists){
            return res.json({'alert': 'email already exist'})
        }else{
            bycrpt.genSalt(10, (err,salt) =>{
                bycrpt.hash(password, salt, (err,hash) =>{
                    req.body.password = hash;
                    db.collection('user').doc(email).set(req.body)
                    .then(data =>{
                        res.json({
                            name: req.body.name,
                            email: req.body.email,
                        })
                    })
                })
            })
        }

    })
    res.json('data received');
    
})


app.listen(3000,()=>{
    console.log('listening on port 3000...');
})