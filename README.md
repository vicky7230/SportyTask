<h1 align="center">🏆 SportyProblem 🏆</h1>

<div align="center">
<img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
<img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
<img src="https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white" alt="Jetpack Compose"/>
</div>

## 🚀 Setup Instructions

### 🔑 API Key Configuration

<div style="background-color: #f8f8f8; padding: 15px; border-radius: 10px; border-left: 5px solid #2196F3;">
This project requires an API key from <a href="https://newsapi.org/">NewsAPI.org</a> to function properly. Follow these steps to set up your API key:
</div>

1. 🌐 Visit [NewsAPI.org](https://newsapi.org/) and register for a free API key
2. 📁 Create or open the `local.properties` file in the root directory of the project
3. ✏️ Add the following line to the file:
   ```properties
   API_KEY=your_actual_api_key
   ```
4. 🔄 Replace `your_actual_api_key` with the API key you obtained from NewsAPI.org

<div style="background-color: #FFF3E0; padding: 15px; border-radius: 10px; border-left: 5px solid #FF9800;">
<strong>⚠️ Important Notes:</strong><br>
- The <code>local.properties</code> file should not be committed to version control (it's already in <code>.gitignore</code>)<br>
- If you don't add the API key, the app will not be able to fetch news data<br>
- The app uses this key for making requests to the NewsAPI.org endpoints
</div>

## 🛠️ Building the Project

<div style="background-color: #E8F5E9; padding: 15px; border-radius: 10px; border-left: 5px solid #4CAF50;">
After setting up your API key, you can build and run the project using Android Studio or Gradle commands.
</div>

```bash
./gradlew assembleDebug
```

Or simply run the app directly from Android Studio.

## 🧰 Tech Stack

<table>
  <tr>
    <td align="center"><img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" width="100px" height="28px"/></td>
    <td>Primary language with Jetpack Compose for modern UI</td>
  </tr>
  <tr>
    <td align="center"><img src="https://img.shields.io/badge/MVVM-FF5252?style=for-the-badge&logoColor=white" width="100px" height="28px"/></td>
    <td>Clean Architecture with MVVM pattern</td>
  </tr>
  <tr>
    <td align="center"><img src="https://img.shields.io/badge/Dagger-00897B?style=for-the-badge&logoColor=white" width="100px" height="28px"/></td>
    <td>Dependency injection framework</td>
  </tr>
  <tr>
    <td align="center"><img src="https://img.shields.io/badge/Retrofit-3E4095?style=for-the-badge&logoColor=white" width="100px" height="28px"/></td>
    <td>Type-safe HTTP client for API calls</td>
  </tr>
  <tr>
    <td align="center"><img src="https://img.shields.io/badge/Coroutines-7E57C2?style=for-the-badge&logoColor=white" width="100px" height="28px"/></td>
    <td>Asynchronous programming with lightweight threads</td>
  </tr>
</table>

## 📜 License

<div style="background-color: #E3F2FD; padding: 15px; border-radius: 10px; border-left: 5px solid #2196F3;">

### MIT License

**Copyright (c) 2025 SportyProblem**

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

<i>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.</i>
</div>

