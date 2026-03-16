# System Rules

## Order Rules
1. Un usuario solo puede tener un pedido activo al mismo tiempo.
2. No se puede crear un pedido si el producto no tiene stock.
3. El pedido debe tener al menos un producto.
4. El pedido debe seleccionarse con un horario de recogida válido.

## Inventory Rules
1. El stock disminuye cuando un pedido se confirma.
2. Un producto con stock 0 no aparece en el menú.

## Pickup Rules
1. Los pedidos deben recogerse dentro del horario asignado.
2. Si el pedido no se recoge en 10 minutos, se marca como expirado.
