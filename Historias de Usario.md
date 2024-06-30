# Historias de Usuario

## Historia de Usuario 1

| **ID** | US001 |
|--------|-------|
| **Título** | Registrar un gasto diario |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder ingresar un gasto diario con detalles como el monto, la categoría y la fecha, para poder llevar un seguimiento detallado de mis finanzas personales. |
| **Criterio de Aceptación** | 1. El usuario puede abrir la aplicación y acceder a la sección de registro de gastos.<br>2. El usuario puede ingresar el monto del gasto, seleccionar una categoría de una lista desplegable y elegir una fecha usando un selector de fecha.<br>3. El gasto registrado se guarda en la base de datos y se muestra en una lista de gastos recientes. |
| **Estimación** | 5 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad está completamente implementada y probada.<br>- La interfaz de usuario es intuitiva y fácil de usar.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- La base de datos guarda correctamente los registros de gastos. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos configurada, diseño de la interfaz) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación.<br>- Los mockups de la interfaz de usuario están disponibles. |

---

## Historia de Usuario 2

| **ID** | US002 |
|--------|-------|
| **Título** | Ver lista de gastos recientes |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder ver una lista de mis gastos recientes para poder revisar y analizar mis gastos pasados fácilmente. |
| **Criterio de Aceptación** | 1. El usuario puede acceder a la lista de gastos recientes desde la pantalla principal de la aplicación.<br>2. La lista muestra el monto, la categoría y la fecha de cada gasto registrado.<br>3. Los gastos se ordenan cronológicamente, con el más reciente primero. |
| **Estimación** | 3 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad está completamente implementada y probada.<br>- La lista se actualiza automáticamente cuando se agrega un nuevo gasto.<br>- La interfaz de usuario es clara y muestra la información de manera accesible.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos con registros de gastos) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación.<br>- Los mockups de la interfaz de usuario están disponibles. |

---

## Historia de Usuario 3

| **ID** | US003 |
|--------|-------|
| **Título** | Editar un gasto registrado |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder editar los detalles de un gasto ya registrado para corregir cualquier error o actualizar la información. |
| **Criterio de Aceptación** | 1. El usuario puede seleccionar un gasto de la lista de gastos recientes y abrir una pantalla de edición.<br>2. El usuario puede modificar el monto, la categoría y la fecha del gasto.<br>3. Los cambios se guardan en la base de datos y la lista de gastos recientes se actualiza para reflejar las modificaciones. |
| **Estimación** | 5 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad está completamente implementada y probada.<br>- La interfaz de usuario permite editar fácilmente los detalles del gasto.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- La base de datos se actualiza correctamente con los cambios. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos con registros de gastos) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación.<br>- Los mockups de la interfaz de usuario están disponibles. |

---

## Historia de Usuario 4

| **ID** | US004 |
|--------|-------|
| **Título** | Eliminar un gasto registrado |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder eliminar un gasto registrado para poder mantener mis registros de gastos actualizados y precisos. |
| **Criterio de Aceptación** | 1. El usuario puede seleccionar un gasto de la lista de gastos recientes y eliminarlo.<br>2. El usuario recibe una confirmación antes de que el gasto sea eliminado.<br>3. El gasto eliminado se borra de la base de datos y desaparece de la lista de gastos recientes. |
| **Estimación** | 3 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad está completamente implementada y probada.<br>- La interfaz de usuario permite eliminar gastos de manera segura, con confirmación.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- La base de datos se actualiza correctamente al eliminar los gastos. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos con registros de gastos, confirmación de eliminación) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación.<br>- Los mockups de la interfaz de usuario están disponibles. |

---

## Historia de Usuario 5

| **ID** | US005 |
|--------|-------|
| **Título** | Persistir datos de gastos en la base de datos |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero que mis datos de gastos se guarden persistentemente en una base de datos para asegurarme de que no se pierdan y puedan ser recuperados en cualquier momento. |
| **Criterio de Aceptación** | 1. Los datos de cada gasto (monto, categoría, fecha, etc.) se guardan en una base de datos.<br>2. Los datos guardados en la base de datos se pueden recuperar y mostrar en la aplicación.<br>3. La aplicación maneja correctamente las operaciones de creación, lectura, actualización y eliminación (CRUD) en la base de datos. |
| **Estimación** | 8 puntos (Scrum Poker) |
| **Definición de Done** | - La persistencia de datos está completamente implementada y probada.<br>- La base de datos guarda y recupera correctamente los datos de gastos.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- Se han realizado pruebas para asegurar la integridad y consistencia de los datos. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (configuración de la base de datos) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación. |

---

## Historia de Usuario 6

| **ID** | US006 |
|--------|-------|
| **Título** | Login para asociar datos a un usuario |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder iniciar sesión en la aplicación para que mis datos de gastos estén asociados a mi cuenta personal y no se mezclen con los datos de otros usuarios. |
| **Criterio de Aceptación** | 1. El usuario puede registrarse en la aplicación con un nombre de usuario y contraseña.<br>2. El usuario puede iniciar sesión con sus credenciales.<br>3. Los datos de gastos se guardan y recuperan según la cuenta del usuario que ha iniciado sesión. |
| **Estimación** | 8 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad de registro e inicio de sesión está completamente implementada y probada.<br>- Los datos de gastos se asocian correctamente al usuario que ha iniciado sesión.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- Se han implementado y probado medidas de seguridad para la autenticación de usuarios. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (configuración de la base de datos, sistema de autenticación) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación. |

---

## Historia de Usuario 7

| **ID** | US007 |
|--------|-------|
| **Título** | Buscar registros de gastos |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder buscar registros de gastos por diferentes criterios como categoría como: servicios básicos, entretenimiento, alimentación, vestimenta, fecha o monto para encontrar rápidamente la información que necesito. |
| **Criterio de Aceptación** | 1. El usuario puede acceder a una función de búsqueda desde la pantalla principal.<br>2. El usuario puede buscar registros de gastos usando criterios como categoría, fecha y monto.<br>3. Los resultados de la búsqueda se muestran en una lista con los detalles de los gastos coincidentes. |
| **Estimación** | 5 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad de búsqueda está completamente implementada y probada.<br>- La interfaz de usuario permite realizar búsquedas fácilmente.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- Los resultados de búsqueda son precisos y relevantes. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos con registros de gastos) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación. |

---

## Historia de Usuario 8

| **ID** | US008 |
|--------|-------|
| **Título** | Agregar comentarios a un registro de gastos |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder agregar comentarios a un registro de gastos para poder proporcionar detalles adicionales o notas personales sobre cada gasto. |
| **Criterio de Aceptación** | 1. El usuario puede agregar un comentario al registrar un nuevo gasto o al editar un gasto existente.<br>2. Los comentarios se guardan en la base de datos junto con los otros detalles del gasto.<br>3. Los comentarios se muestran en la lista de gastos recientes y en la pantalla de detalles del gasto. |
| **Estimación** | 3 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad de agregar comentarios está completamente implementada y probada.<br>- La interfaz de usuario permite agregar y mostrar comentarios de manera intuitiva.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- Los comentarios se guardan y recuperan correctamente en la base de datos. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación. |

---

## Historia de Usuario 9

| **ID** | US009 |
|--------|-------|
| **Título** | Ver el saldo de la cuenta |
| **Descripción** | Yo, como usuario de la aplicación de registro de gastos, quiero poder ver el saldo actual de mi cuenta para tener un control claro de mis finanzas y saber cuánto dinero tengo disponible. |
| **Criterio de Aceptación** | 1. El usuario puede ver el saldo de su cuenta en la pantalla principal de la aplicación.<br>2. El saldo se actualiza automáticamente cuando se registra, edita o elimina un gasto.<br>3. El saldo refleja correctamente la suma de todos los ingresos y gastos registrados en la cuenta del usuario. |
| **Estimación** | 5 puntos (Scrum Poker) |
| **Definición de Done** | - La funcionalidad de mostrar el saldo está completamente implementada y probada.<br>- La interfaz de usuario muestra el saldo de manera clara y accesible.<br>- El código ha pasado las revisiones de calidad y se ha integrado en la rama principal del proyecto.<br>- El saldo se actualiza en tiempo real con las transacciones de gastos e ingresos. |
| **Definición de Ready** | - Los criterios de aceptación están claramente definidos.<br>- Las dependencias necesarias (base de datos, lógica de cálculo de saldo) están listas.<br>- El equipo ha discutido la historia y está de acuerdo con la estimación. |

---
