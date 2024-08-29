
function showCustomNotification(message) {
            const notification = document.getElementById('custom-notification');
            const messageElement = document.getElementById('notification-message');

            messageElement.textContent = message;
            notification.classList.remove('hidden');
            notification.classList.add('visible');

            // Cache la notification après 5 secondes
            setTimeout(closeNotification, 5000);
        }

        // Fonction pour fermer la notification
        function closeNotification() {
            const notification = document.getElementById('custom-notification');
            notification.classList.remove('visible');
            notification.classList.add('hidden');


        }

        // Ajout d'un écouteur d'événement sur le bouton
        document.getElementById('btnYes').addEventListener('click', () => {

            showCustomNotification('Suppression éffectée !');

        });




