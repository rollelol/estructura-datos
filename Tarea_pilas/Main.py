class Pila:
    def __init__(self):
        self.elementos = []

    def apilar(self, elemento):
        self.elementos.append(elemento)

    def desapilar(self):
        if not self.es_vacia():
            return self.elementos.pop()
        else:
            return "La pila está vacía"

    def cima(self):
        if not self.es_vacia():
            return self.elementos[-1]
        else:
            return "La pila está vacía"

    def es_vacia(self):
        return len(self.elementos) == 0

    def tamaño(self):
        return len(self.elementos)


mi_pila = Pila()
mi_pila.apilar(1)
mi_pila.apilar(2)
print(mi_pila.cima())     
print(mi_pila.desapilar())  
print(mi_pila.tamaño())     