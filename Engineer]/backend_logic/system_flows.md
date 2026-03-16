graph TD
    Start([User starts App]) --> Login{is Logged In?}
    
    Login -- No --> ScreenLogin[Show Login Screen]
    ScreenLogin --> Login
    
    Login -- Yes --> Browse[Browse Menu Items]
    Browse --> Select[Select Product]
    
    Select --> Stock{Check Stock > 0?}
    
    Stock -- No --> Error[Show Out of Stock Message]
    Error --> Browse
    
    Stock -- Yes --> Cart[Add to Shopping Cart]
    Cart --> Confirm[Confirm Pre-Order]
    
    Confirm --> Status[Set Status to PENDING]
    Status --> Kitchen[Send Order to Kitchen Staff]
    
    Kitchen --> Ready[Set Status to READY]
    Ready --> Pickup([Student Picks Up Order])