var express = require('express');
var router = express.Router();
var ctrlMekanlar=require('../controllers/mekanlar');
var ctrlDigerleri=require('../controllers/digerleri')





router.get('/', ctrlMekanlar.anaSayfa);
router.get('/mekan', ctrlMekanlar.mekanBilgisi);
router.get('/mekan1', ctrlMekanlar.sokakCafe);
router.get('/mekan2', ctrlMekanlar.lucca);
router.get('/mekan3', ctrlMekanlar.sarimsak);
router.get('/mekan4', ctrlMekanlar.kahveDiyari);
router.get('/mekan5', ctrlMekanlar.gloriaJeans);
router.get('/mekan/yorum/yeni', ctrlMekanlar.yorumEkle);
router.get('/hakkinda',ctrlDigerleri.hakkinda);

module.exports = router;
