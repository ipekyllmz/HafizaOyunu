var express = require('express');
var router = express.Router();
var anaSayfa= function(req,res){
         res.render('mekanlar-liste',{'title':'Anasayfa'});
}

var mekanBilgisi= function(req,res){
         res.render('mekan-detay',{'title':'Mekan Bilgisi'});
}

var yorumEkle= function(req,res){
         res.render('yorum-ekle',{'title':'Yorum Ekle'});
}

var sokakCafe= function(req,res){
         res.render('mekan-detay-1',{'title':'Sokak Cafe'});
}

var lucca= function(req,res){
         res.render('mekan-detay-2',{'title':'Lucca'});
}

var sarimsak= function(req,res){
         res.render('mekan-detay-3',{'title':'Lucca'});
}

var kahveDiyari= function(req,res){
         res.render('mekan-detay-4',{'title':'Kahve Diyarı'});
}

var gloriaJeans= function(req,res){
         res.render('mekan-detay-5',{'title':'Gloria Jeans'});
}

module.exports={
	anaSayfa,
	lucca,
	sarimsak,
	kahveDiyari,
    gloriaJeans,
	sokakCafe,
    mekanBilgisi,
    yorumEkle};





