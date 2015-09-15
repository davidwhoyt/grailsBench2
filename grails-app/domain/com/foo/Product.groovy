package com.foo

class Product {
    Long id
    String upc
    String description

    static mapping = {
        table 'product'
        version false
        columns {
            id column: 'productid', insert: false, update:false, generator: 'assigned', name: "productid"
            upc column: 'upc'
            description column: 'description'
        }

    }


}
