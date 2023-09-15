import math # Importando uma Biblioteca para uso Global.
# Função
def busca_menor_nota(disciplinas):
    menor_nota = math.inf
    menor_nome = ""
    for nome, (nota, _) in disciplinas.items():
        if nota < menor_nota:
            menor_nota = nota
            menor_nome = nome
    return menor_nome, menor_nota
qtd_materias = int(input("Informe a quantidade de matérias: "))
print() # Usado apenas para pular uma linha.

# Função
def busca_maior_nota(disciplinas):
    # pass
    maior_nota = -math.inf
    maior_nome = ""
    for nome, (nota, _) in disciplinas.items():
        if nota > maior_nota:
            maior_nota = nota
            maior_nome = nome
    return maior_nome, maior_nota

# Função
def calcula_media_pd(disciplinas):
    # pass
    soma = 0.0
    soma_dos_pesos = 0
    for _, (nota, peso) in disciplinas.items():
        soma += nota * peso
        soma_dos_pesos += peso
    media_pd = soma / soma_dos_pesos
    return media_pd

# Dicionário vazio.
disciplinas = {}
while qtd_materias > 0:
    # Lista que recebe os dados do usuário.
    linha = input("Materia - Nota - Peso: ").split()
    nome_da_materia = linha[0]
    nota = float(linha[1])
    peso = int(linha[2])
    disciplinas[nome_da_materia] = (nota, peso)
    qtd_materias -= 1
(menor_nome, menor_nota) = busca_menor_nota(disciplinas)
(maior_nome, maior_nota) = busca_maior_nota(disciplinas)
media_pd = calcula_media_pd(disciplinas)
print() # Usado apenas para pular uma linha.

print("Menor: %s %.1f" % (menor_nome, menor_nota))
print("Maior: %s %.1f" % (maior_nome, maior_nota))
print("Média: %.2f" % (media_pd))
