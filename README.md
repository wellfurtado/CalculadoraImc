# 📱 IMC Calculator - Cálculo do Índice de Massa Corporal (IMC)

Este é um aplicativo simples, desenvolvido como um **projeto de estudo**, para calcular o **Índice de Massa Corporal (IMC)**, desenvolvido em **Kotlin** utilizando **Jetpack Compose e Material Design**.🚀

> **Objetivo do projeto**: Aprender conceitos básicos de desenvolvimento Android com Kotlin, incluindo **layouts com ConstraintLayout, manipulação de eventos de clique, validação de entrada do usuário e utilização de Snackbar**.

---

## 📌 Funcionalidades
✔ Permite que o usuário insira **peso e altura**.  
✔ Calcula automaticamente o **IMC** com base na fórmula:  
\\[ IMC = \frac{peso}{altura^2} \\]  
✔ Exibe mensagens de erro caso os campos estejam vazios.  
✔ Utiliza **Snackbar** para notificar o usuário de campos obrigatórios.  
✔ Interface moderna com **Material Design**.

---

## 🖼️ Demonstração

*(Adicione capturas de tela do aplicativo aqui)*

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin** como linguagem principal.
- **Jetpack Compose** para construção da interface gráfica.
- **Material Design** para um design moderno.
- **Snackbar** para notificações.
- **ConstraintLayout** para estruturação da UI.

---

## 📥 Como Baixar e Rodar o Projeto?

### 📌 **Pré-requisitos**
- **Android Studio** versão **Arctic Fox (ou superior)**.
- **Emulador ou dispositivo físico com Android 7+**.
- **Gradle instalado e atualizado**.

### 🔽 **Passos para rodar o projeto**
1. **Clone este repositório** no seu computador:
   ```bash
   git clone https://github.com/seu-usuario/imc-calculator.git
   ```  
2. **Abra o Android Studio** e importe o projeto.
3. **Conecte um dispositivo ou inicie um emulador**.
4. **Clique no botão ▶️ Run** para compilar e executar o app!

---

## 📜 Como funciona o código?

O aplicativo segue uma estrutura simples baseada no **Activity Lifecycle**. O código principal está em `MainActivity.kt`:

- **Captura os valores de entrada do usuário** através de `TextInputEditText`.
- **Verifica se os campos estão preenchidos** antes de calcular.
- **Realiza o cálculo do IMC** e exibe no console (`println`).
- **Exibe mensagens de erro** via `Snackbar` caso algum campo esteja vazio.

Trecho do código principal:
```kotlin
btnCalcular.setOnClickListener {
    val pesoSTR: String = edtPeso.text.toString()
    val alturaSTR: String = edtAltura.text.toString()

    if (pesoSTR.isEmpty() || alturaSTR.isEmpty()) {
        Snackbar.make(edtPeso, "Preencha todos os campos", Snackbar.LENGTH_LONG).show()
    } else {
        val peso: Float = pesoSTR.toFloat()
        val altura: Float = alturaSTR.toFloat()

        val imc = peso / (altura * altura)
        println("IMC = $imc")
    }
}
```

---

## 🚀 Melhorias Futuras

🔹 Exibir a categoria do IMC (**Abaixo do peso, Normal, Sobrepeso, Obesidade**).  
🔹 Criar um botão para **limpar os campos**.  
🔹 Exibir o resultado diretamente na tela ao invés do console.  
🔹 Implementar **animações** ao calcular o IMC.

Se quiser sugerir melhorias ou contribuir, **sinta-se à vontade para abrir uma Issue ou Pull Request!** 🚀

---

## 🤝 Conecte-se Comigo

<a href="https://www.linkedin.com/in/wellington-furtado/"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
<a href="mailto:wellfurtado@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
<a href="https://github.com/wellfurtado"><img src="https://img.shields.io/badge/GitHub-000000?style=for-the-badge&logo=github&logoColor=white"/></a>

---

## 📜 Licença

Este projeto foi desenvolvido para fins de estudo e está disponível sob a **licença MIT**.

Se quiser contribuir, fique à vontade! 🚀✨

```
The MIT License (MIT)

Copyright (c) 2023 Roque Buarque Junior

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
---

Feito por [Wellington Damasceno](https://github.com/wellfurtado) 🚀
