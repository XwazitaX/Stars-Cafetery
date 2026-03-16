# Order States

## Estados posibles

PENDING → Pedido creado
PREPARING → Cocina preparando pedido
READY → Pedido listo
PICKED_UP → Pedido entregado
CANCELLED → Pedido cancelado

## Flujo permitido

PENDING → PREPARING  
PREPARING → READY  
READY → PICKED_UP  

También:

PENDING → CANCELLED

