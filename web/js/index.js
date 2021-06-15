(function () {

    const applyScrollEffects = () => {

        // Navbar morph
        window.scrollY > 100 ?
                document.querySelector('.navigation').classList.add('sticky') :
                document.querySelector('.navigation').classList.remove('sticky')


        // Reveal effects
        document.querySelectorAll('.reveal').forEach(elm => {
            isInViewport(elm) ? elm.classList.add('visible') : elm.classList.remove('visible')
        })


        // Dynamic background generator
        document.querySelectorAll('.change-background').forEach(elm => {
            if (isInViewport(elm)) {
                document.querySelector('.fake-bg').style.backgroundColor = elm.dataset.color
                document.querySelector('.fake-bg').classList.add('on')
            } else {
                document.querySelector('.fake-bg').classList.remove('on')
            }
        })
    }

    document.addEventListener('scroll', applyScrollEffects)


    // Object viewport detection
    const isInViewport = el => {
        const rect = el.getBoundingClientRect()
        const vertInView = (rect.top <= window.innerHeight) && ((rect.top + rect.height) >= 0)
        const horInView = (rect.left <= window.innerWidth) && ((rect.left + rect.width) >= 0)
        return (vertInView && horInView)
    }


    // Scroll navigation links
    const scrollButtons = document.querySelectorAll('.scrollto');
    scrollButtons.forEach(elm => {
        elm.onclick = e => {
            const href = elm.getAttribute('href')
            document.querySelector(href).scrollIntoView({behavior: 'smooth'})
        }
    })
})();

function changeToDarkMode() {
    var checkbox = document.getElementById('switch');
    if (checkbox.checked) {
        document.cla
        document.getElementById('skyline').classList.add('dark-mode')
        document.getElementById('header-nav').classList.add('texto-violeta')
        document.getElementById('body').classList.add('bg-dark-mode')
        document.getElementById('body2').classList.add('bg-dark-mode')


    } else {
        document.getElementById('body').classList.remove('dark-mode')
        document.getElementById('body').classList.add('bg-light')
        document.getElementById('skyline').classList.remove('dark-mode')

    }
}