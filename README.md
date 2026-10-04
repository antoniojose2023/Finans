# 💹 Finans — Simulador de Investimentos

> Descubra quanto seus investimentos podem render com **aportes mensais** e **juros compostos**.

![Plataforma](https://img.shields.io/badge/plataforma-Android-3DDC84?logo=android&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![Licença](https://img.shields.io/badge/licença-MIT-blue)

---

## 📖 Sobre o projeto

O **Finans** é um aplicativo mobile que permite simular a evolução de um investimento ao longo do tempo. Basta informar o valor inicial, quanto será investido todo mês, a taxa de juros e o prazo. O app calcula e mostra:

- 🏆 **Valor final acumulado**
- 📊 **Valor total investido**
- 💰 **Lucro obtido** com os juros

É uma ferramenta simples e direta para quem quer planejar objetivos financeiros e entender o efeito dos juros compostos no longo prazo.

---

## 📱 Screenshots

| Tela inicial | Configuração da simulação | Resultados |
|:---:|:---:|:---:|
| <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/7edc5a81-562e-4351-b797-dda667d6ade9" /> | <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/527f5768-a389-4139-b686-a75db8326721" /> | <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/dfeadde4-5baa-4b4e-ac9f-04eddc73a4bf" /> |

> 💡 Salve os prints na pasta `docs/screenshots/` com esses nomes para que as imagens apareçam aqui.

---

## ✨ Funcionalidades

- **Tela de boas-vindas** com apresentação do app e botão *Começar Simulação*
- **Formulário de simulação** com quatro campos:
  | Campo | Descrição | Exemplo |
  |---|---|---|
  | Valor Inicial | Quanto você já possui para investir | `1000,00` |
  | Aporte mensal | Quanto será investido todo mês | `500,00` |
  | Taxa de juros (% ao ano) | Rentabilidade esperada (ex.: CDI, Tesouro Direto) | `0.01` |
  | Tempo (anos) | Por quanto tempo você quer investir | `1` |
- **Tela de resultados** com cards de valor final, valor investido e lucro
- Valores formatados em **Real brasileiro (R$)**
- Interface em tons de verde, limpa e com navegação simples (botão voltar)

---

## 🧮 Como o cálculo funciona

O app utiliza a fórmula de **juros compostos com aportes mensais**:

```
M = P · (1 + i)^n  +  A · [ ((1 + i)^n − 1) / i ]
```

| Variável | Significado |
|---|---|
| `M` | Montante final |
| `P` | Valor inicial |
| `A` | Aporte mensal |
| `i` | Taxa de juros por período (mensal) |
| `n` | Número de meses (anos × 12) |

Também são calculados:

```
Valor investido = P + (A · n)
Lucro obtido    = M − Valor investido
```

### Exemplo

Com valor inicial de **R$ 1.000,00**, aporte mensal de **R$ 500,00**, taxa de `0.01` e **1 ano**:

| Resultado | Valor |
|---|---|
| Valor investido | R$ 7.000,00 |
| Lucro obtido | R$ 468,08 |
| **Valor final acumulado** | **R$ 7.468,08** |

---

## 🛠️ Tecnologias

> ⚠️ Preencha/ajuste esta seção conforme a stack real do projeto.

- Android (Material Design 3)
- Linguagem: `Kotlin` 
- Navegação entre telas: Home → Simulação → Resultados

---

## 🚀 Como executar

### Pré-requisitos

- [Git](https://git-scm.com/)
- [Android Studio](https://developer.android.com/studio) (versão estável mais recente)
- Dispositivo Android ou emulador (API 24+) — _ajustar_

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/antoniojose2023/Finans.git

# 2. Entre na pasta do projeto
cd Finans

# 3. Abra no Android Studio, aguarde o sync do Gradle
#    e execute em um emulador ou dispositivo físico (▶ Run)
```

---

## 📂 Estrutura do projeto

> Exemplo — ajuste para refletir a estrutura real.

```
Finans/
├── app/
│   └── src/main/
│       ├── java/.../finans/
│       │   ├── ui/            # Telas (Home, Simulação, Resultados)
│       │   ├── viewmodel/     # Lógica de estado
│       │   └── utils/         # Cálculo de juros e formatação de moeda
│       └── res/               # Layouts, ícones, strings, temas
├── docs/screenshots/          # Prints do app
└── README.md
```

---

## 🗺️ Roadmap

- [ ] Gráfico de evolução do patrimônio mês a mês
- [ ] Histórico de simulações salvas

---

## 🤝 Contribuindo

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b feature/minha-feature`
3. Commit: `git commit -m "feat: minha nova feature"`
4. Push: `git push origin feature/minha-feature`
5. Abra um Pull Request

---

## 📄 Licença

Distribuído sob a licença **MIT**. Veja o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor

**Antonio José**
[![GitHub](https://img.shields.io/badge/GitHub-antoniojose2023-181717?logo=github)](https://github.com/antoniojose2023)

---

⭐ Se este projeto te ajudou, deixe uma estrela no repositório!

> ⚠️ **Aviso:** as simulações são apenas ilustrativas e não representam garantia de rentabilidade nem recomendação de investimento.
