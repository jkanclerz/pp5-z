const getProducts = () => {
    return fetch('/api/products')
        .then(response => response.json())
        .then(products => console.log(products))
//        .then(products => createHtmlElmentsBasedOnJson))
        .catch(err => console.log(err));
}

const handlerAddToCart = (productId) => {

}

(() => {
    console.log("Hello WOrld");

    getProducts()
        .then(() => console.log('it works, fajrant'));

})();