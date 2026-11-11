# 🍔 Sistema de Lanchonete — Java POO

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat&logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=flat)

Projeto desenvolvido para praticar Design Patterns Criacionais (Singleton, Factory e Builder) e Collections em Java, como parte da minha transição de carreira para Desenvolvedor Java Back-End — Curso IsiFLIX.

---

## 🚀 Funcionalidades

- Montagem de lanches passo a passo, com ingredientes obrigatórios (pão e carne) e opcionais (molho, bacon e queijo)
- Registro de pedidos com id gerado automaticamente e valor validado
- Pagamento por Pix, Boleto, Cartão, Cartão de Débito, Alelo ou Dinheiro
- Listagem dos pedidos na ordem em que foram feitos

---

## 🧠 Conceitos aplicados

- Design Pattern Singleton (`GeradorId`)
- Design Pattern Factory (`PagamentoFactory`)
- Design Pattern Builder (`Lanche.Builder`)
- Interface e Polimorfismo (`FormaDePagamento`)
- Enum (`TipoPagamento`)
- List e ArrayList (coleções)
- Validação de regras de negócio com `IllegalArgumentException`
- Imutabilidade com `final` e ausência de setters
- Separação de responsabilidades em pacotes

---

## 📁 Estrutura do projeto

```
src/
├── Main.java       → execução do programa
├── model/          → entidades do sistema (Lanche, Pedido)
├── pagamento/      → formas de pagamento e fábrica (FormaDePagamento, Pix, Boleto, Cartao, CartaoDebito, Alelo, Dinheiro, TipoPagamento, PagamentoFactory)
├── service/        → regras de negócio (PedidoService)
└── util/           → ferramentas de apoio (GeradorId)
```

---

## ▶️ Execução

1. Clone o repositório
2. Abra o projeto na sua IDE (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Main.java`
4. Veja no console os pedidos e os pagamentos realizados

---

## ⚙️ Melhorias futuras

- [ ] Buscar pedido pelo id (usando `Map`)
- [ ] Usar `BigDecimal` no valor dos pedidos
- [ ] Persistir os pedidos em banco de dados
- [ ] Adicionar testes unitários (JUnit)
