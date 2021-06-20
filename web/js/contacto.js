    // Autorrellenable

    var text = 'Para cualquier duda o sugerencia. Ponte en contacto conmigo '
    var i = 0
    var f = -1
    var k = 1
    setInterval(type, 5000)
   
    var firstTime = true
    function type() {
        
        if (i < text.length) {
            document.getElementById("text").innerHTML += text.charAt(i)
            i++
            setTimeout(type, 100)
        } else {
            k = 0
            f = -1
           
            if(firstTime){
                 sleep(2000);
                 firstTime = false
            }
            
            typeReverse()
        }
    }

    function typeReverse() {
    
        if (k < text.length) {
            document.getElementById("text").innerHTML = text.slice(0, f);
            k++
            f--
            setTimeout(typeReverse, 40)
        } else {
            document.getElementById("text").innerHTML = '&nbsp'
            i = 0;
            firstTime = true
        }
    }

    function sleep(milliseconds) {
        var start = new Date().getTime();
        for (var i = 0; i < 1e7; i++) {
            if ((new Date().getTime() - start) > milliseconds) {
                break;
            }
        }
    }

