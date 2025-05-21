// Seleciona todos os elementos com a classe 'flashcard'
const flashcards = document.querySelectorAll('.flashcard');

// Para cada flashcard encontrado, adiciona um "ouvinte de eventos"
flashcards.forEach(card => {
    card.addEventListener('click', () => {
        // Alterna a classe 'flipped' quando o flashcard é clicado
        // Se a classe 'flipped' estiver presente, ela é removida.
        // Se não estiver presente, ela é adicionada.
        card.classList.toggle('flipped');
    });
});

console.log('Script de flashcards carregado com sucesso!'); // Mensagem para o console do navegador
