/**
 * This file is part of the "eidolon" project.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the LICENSE is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package io.symcore.eidolon.component.router.tree

import io.symcore.eidolon.component.router.compilation.Lexer.Token

/**
 * TokenTree
 *
 * @author Elliot Wright <elliot@elliotwright.co>
 */
class TokenTree(val token: Token) extends Tree
