class nodo:
    def __init__(self, data):
        self.data = data
        self.next = None

class listaEnlazada:
    def __init__(self):
        self.cabeza = None

    def vacio(self):
        return self.cabeza is None

    def agregar_nodo(self, dato):
        nuevo_nodo = nodo(dato)
        if self.vacio():
            self.cabeza = nuevo_nodo
        else:
            nodo_actual = self.cabeza
            while nodo_actual.next is not None:
                nodo_actual = nodo_actual.next
            nodo_actual.next = nuevo_nodo

    def imprimir_lista(self):
        nodo_actual = self.cabeza
        while nodo_actual is not None:
            print(nodo_actual.data)
            nodo_actual = nodo_actual.next

mi_lista = listaEnlazada()
mi_lista.agregar_nodo(1)
mi_lista.agregar_nodo(2)
mi_lista.agregar_nodo(3)
