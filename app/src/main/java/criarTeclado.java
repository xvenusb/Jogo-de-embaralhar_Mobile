private void criarTeclado() {
    String nome, sobrenome;
    String letras = nome + sobrenome + " "; // Inclui as letras e um espaço
    for (char letra : letras.toCharArray()) {
        Button tecla = new Button(this); // Cria um novo botão para cada letra
        tecla.setText(String.valueOf(letra)); // Define o texto do botão
        tecla.setLayoutParams(new GridLayout.LayoutParams()); // Define o layout do botão
        tecla.setBackgroundColor(Color.LTGRAY); // Define a cor inicial do botão

        // Listener para quando o botão é clicado
        tecla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tecla.setBackgroundColor(Color.GREEN); // Muda a cor da tecla clicada
                if (letra == ' ') {
                    inputNome.append(" "); // Adiciona espaço ao nome
                } else if (nome.contains(String.valueOf(letra))) {
                    inputNome.append(letra); // Adiciona letra ao nome
                } else if (sobrenome.contains(String.valueOf(letra))) {
                    inputSobrenome.append(letra); // Adiciona letra ao sobrenome
                }
                atualizarMensagem(); // Atualiza os textos exibidos
            }
        });

        teclado.addView(tecla); // Adiciona o botão ao layout do teclado
        teclas.add(tecla); // Adiciona o botão à lista de teclas
    }
}